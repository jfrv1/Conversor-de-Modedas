# Conversor de Monedas 💱

Este proyecto es el resultado de un desafío de programación cuyo objetivo es desarrollar un **Conversor de Monedas** 
utilizando **Java**. 
A lo largo del proyecto, se aplicaron conceptos clave como el consumo de APIs, 
el manejo de datos en formato JSON y la interacción con el usuario a través de consola.

## 🚀 Objetivos del Proyecto

- Realizar solicitudes HTTP a una API de tasas de cambio.
- Procesar y analizar datos JSON recibidos desde la API.
- Filtrar monedas relevantes para el usuario.
- Mostrar los resultados de manera clara y funcional.

---

## 🛠️ Tecnologías Utilizadas

- **Java** (JDK 17 o superior recomendado)
- **IDE**: IntelliJ IDEA 
- **Bibliotecas**:
  - `java.net.http.HttpClient` (para consumir la API)
  - `org.json` u otra biblioteca para manejar JSON

---

## 🧩 Estructura del Desarrollo

1. **Configuración del ambiente Java**  
   Instalación del JDK y preparación del entorno de desarrollo.

2. **Creación del Proyecto**  
   Inicialización del proyecto con las clases necesarias.

3. **Consumo de la API**  
   Uso de `HttpClient` para realizar una solicitud GET a la API de ExchangeRate.

4. **Análisis de la Respuesta JSON**  
   Parseo del JSON recibido para extraer las tasas de cambio.

5. **Filtro de Monedas**  
   Selección de monedas específicas de interés.

6. **Exhibición de Resultados**  
   Presentación de los resultados en consola para el usuario final.

---

## 🔄 API Utilizada

Este conversor utiliza la [ExchangeRate API](https://www.exchangerate-api.com/) para obtener tasas de cambio actualizadas.

- Documentación oficial: [https://www.exchangerate-api.com/docs](https://www.exchangerate-api.com/docs)
- Se requiere una API Key gratuita (en el plan básico).

---

## 🧪 Cómo Ejecutar el Proyecto

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/conversor-monedas.git
   cd conversor-monedas
