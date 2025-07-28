# --- Stage 1: Build Stage ---
# Menggunakan base image Maven dengan JDK yang sesuai (misal: 21)
FROM maven:3.9-eclipse-temurin-21-alpine AS builder

# Tentukan direktori kerja
WORKDIR /app

# Salin seluruh konteks proyek (parent POM dan semua modul)
COPY . .

# Jalankan proses build Maven dari root.

# Ini akan mengompilasi semua modul dan menempatkan JAR di folder target masing-masing.
RUN mvn clean package -DskipTests -B

# --- Stage 2: Final Runtime Stage ---
# Menggunakan base image JRE yang jauh lebih kecil untuk efisiensi
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

# (Opsional) Membuat user non-root untuk keamanan
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

# Terima ARG untuk port dan path JAR dari docker-compose.yml
ARG APP_PORT=8080
ARG JAR_FILE_PATH=target/*.jar

# Tetapkan environment variable SERVER_PORT yang akan dibaca oleh Spring Boot
ENV SERVER_PORT=${APP_PORT}

# Salin HANYA file JAR yang relevan dari stage 'builder'
COPY --from=builder /app/${JAR_FILE_PATH} app.jar

# Expose port yang diterima dari argumen
EXPOSE ${APP_PORT}

# Jalankan aplikasi
ENTRYPOINT ["java", "-jar", "app.jar"]