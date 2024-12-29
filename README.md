# Spring Boot Click UZ Client

Используя эту библиотеку `Spring Boot Click UZ Client`, вы сможете легко интегрировать платежную систему ClickUZ в ваши проекты.

## 1. Первый шаг

Надо добавить `spring-boot-click-uz-client`.

```xml
<dependency>
    <groupId>org.khasanof</groupId>
    <artifactId>spring-boot-click-uz-client</artifactId>
    <version>1.0.0</version>
</dependency>
```

## 2. Второй шаг

настраивать конфигурация в yaml

```yaml
click-uz:
  service-id: "your_service_id"
  merchant-id: "your_merchant_id"
  merchant-user-id: "your_merchant_user_id"
  secret-key: "your_secret_key"
  merchant-url: https://api.click.uz/v2/merchant/
```

## 3. Третий шаг

Используйте методы интерфейса [`ClickMerchantService`](src/main/java/org/khasanof/service/ClickMerchantService.java).