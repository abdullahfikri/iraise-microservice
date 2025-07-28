FROM quay.io/keycloak/keycloak:latest

COPY ./config/development-realm.json /opt/keycloak/data/import/

ENV KC_KEYCLOAK_ADMIN=admin
ENV KC_KEYCLOAK_ADMIN_PASSWORD=admin

EXPOSE 8080

ENTRYPOINT ["/opt/keycloak/bin/kc.sh", "start-dev", "--import-realm"]
