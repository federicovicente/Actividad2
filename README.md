# Actividad 2 – Programación de Vanguardia

---
## Federico Luis Vicente
### 29664569

---
Este proyecto corresponde a la **Actividad 2 de la materia Programación de Vanguardia** y consiste en el desarrollo de una aplicación Java basada en Maven que utiliza las librerías **Apache Commons CLI** y **Log4j 2**. La aplicación fue desarrollada en **IntelliJ IDEA** y está configurada para compilarse y ejecutarse utilizando el sistema de construcción Maven según las indicaciones.

---

## 💡 Objetivo

Desarrollar una aplicación de consola que reciba parámetros por línea de comandos, registre logs con distintos niveles, y genere un archivo ejecutable `.jar` utilizando Maven.

---

## ⚙️ Configuración del proyecto

- **GroupId:** `ar.edu.udeci.pv`
- **ArtifactId:** `Actividad2`
- **Version:** `1.0-SNAPSHOT`
- **Java Version:** 18
- **IDE:** IntelliJ IDEA Community Edition

---

## 📦 Dependencias utilizadas

### Apache Commons CLI

Permite interpretar argumentos pasados por consola (como `-n` o `--nombre`). Usado para capturar el nombre y la actividad que realiza el usuario.

```xml
<dependency>
    <groupId>commons-cli</groupId>
    <artifactId>commons-cli</artifactId>
    <version>1.5.0</version>
</dependency>
```
### Apache Log4j 2

Se utiliza para registrar información y errores de manera estructurada y profesional.

```xml
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.20.0</version>
</dependency>
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-api</artifactId>
    <version>2.20.0</version>
</dependency>
```
## ▶️ Ejecución de la aplicación
### Compilación

Desde IntelliJ IDEA, utilizando el panel Maven > Lifecycle > clean y luego package.

Esto genera un .jar en la carpeta target.

### Ejecución
La app se ejecuta desde IntelliJ pasando los argumentos necesarios:
```xml
-n <nombre> -a <actividad>
```
### Ejemplo de ejecución:
```
-n Federico -a "2 de Java"
```

### Resultado
```
Hola Federico, la actividad 2 de java fue completada.
```
Y en los logs:
```
INFO  ar.edu.udeci.pv.Main - Nombre recibido: Federico
INFO  ar.edu.udeci.pv.Main - Actividad recibida: 2 de java
```

## 🛠 Desarrollo asistido por LLM
El código de ejemplo de uso para Commons CLI y Log4j 2, fueron generados y explicados por la LLM chatGPT 4o. También me asistió en el paso a paso de la creación y prueba del proyecto así como en la creación del archivo README.