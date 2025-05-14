<p align="center">
  <a href="https://spring.io/projects/spring-boot" target="_blank"><img src="https://cdn.prod.website-files.com/62fe7df122d31a02e9e1bd35/6319947897079ee6ea205e5e_side-banner-icon%20(1).webp" width="120" alt="Logo Spring Boot" /></a>
  <a href="https://www.docker.com/" target="_blank"><img src="https://images.icon-icons.com/2415/PNG/512/docker_original_logo_icon_146556.png" width="120" alt="Logo Docker" /></a>
</p>

<p align="center">Un marco moderno, rápido y eficiente para construir aplicaciones empresariales utilizando <a href="https://www.java.com/" target="_blank">Java</a> con <a href="https://spring.io/projects/spring-boot" target="_blank">Spring Boot</a>.</p>

<p align="center">
  <a href="https://hub.docker.com/" target="_blank">Docker Hub</a> | 
  <a href="https://www.docker.com/docs/" target="_blank">Documentación de Docker</a> | 
  <a href="https://www.java.com/es/" target="_blank">Java</a> | 
  <a href="https://spring.io/projects/spring-boot" target="_blank">Spring Boot</a> | 
  <a href="https://maven.apache.org/" target="_blank">Maven</a> | 
  <a href="https://openjdk.java.net/" target="_blank">JDK</a>
</p>

# 🧩 App Spring Boot Dockerizada

Aplicación Spring Boot lista para ejecutarse en cualquier entorno con Docker.  
Publicada en Docker Hub para facilitar su despliegue.

---

## 📦 Docker Hub

🔗 Repositorio público:  
[https://hub.docker.com/r/danielsamx9/springboot-demoapp](https://hub.docker.com/r/danielsamx9/springboot-demoapp)

---

## 🖥 GitHub

🔗 Repositorio del proyecto en GitHub:  
[https://github.com/AndersonCango/practica01-springboot-AndersonCango](https://github.com/AndersonCango/practica01-springboot-AndersonCango)

---

## ✅ Requisitos

- [Docker](https://www.docker.com/products/docker-desktop) instalado (v20+ recomendado)
- Acceso a internet para descargar la imagen desde Docker Hub

---

## 🧪 Cómo ejecutar el docker

### 1. Descargar la imagen desde Docker Hub

```bash
docker pull danielsamx9/springboot-demoapp
```

### 2. Ejecutar la imagen

```bash
docker run -p 8080:8080 danielsamx9/springboot-demoapp
```

### 3. Accede desde el navegador

```bash
http://localhost:8080/practice-01
```

---

## 🧪 Cómo ejecutar con git

### 1. Clona el repositorio

```bash
git clone https://github.com/AndersonCango/practica01-springboot-AndersonCango.git
```

### 2. Instalar las dependencias

```bash
mvn clean install
```

Este comando hará lo siguiente:

- Limpiar cualquier compilación previa.
- Instalar las dependencias necesarias que están definidas en el archivo pom.xml.
- Compilar el proyecto y generar un archivo .jar listo para ejecutarse.

### 3. Ejecución del proyecto

Ejecuta el proyecto con:

```bash
mvn run
```

O, si prefieres ejecutar el archivo .jar generado, puedes usar:

```bash
java -jar target/<cualquier-nombre>.jar
```

### 4. Acceder a la aplicación:

Una vez que la aplicación esté corriendo, podrás acceder a ella en tu navegador en:

```bash
http://localhost:8080/practice-01
```
