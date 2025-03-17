# 🎉 Bienvenidos al repositorio de _TIC TAC TOE_! 🎮

## 📝 Descripción del Proyecto

_TIC TAC TOE_ es una implementación en Java del clásico juego de Tres en Raya. Se trata de un juego para dos jugadores (❌ y ⭕) que se desarrolla en una cuadrícula de 3x3. El jugador ❌ siempre inicia la partida. Un jugador gana si consigue alinear tres de sus símbolos en una fila, columna o diagonal. Si todas las casillas están ocupadas y no hay un ganador, la partida termina en empate. Al finalizar el juego, se muestra un mensaje indicando el resultado.

## 🚀 Características Principales

- ✅ Juego para dos jugadores en terminal.
- 🎯 Interacción por medio de entrada de teclado.
- ⚠️ Verificación de movimientos válidos.
- 🏆 Detección automática de ganador o empate.
- 🎨 Representación visual del tablero en consola.

## 🛠 Tecnologías Utilizadas

- **Lenguaje de Programación:** Java 21 ☕
- **Entorno de Desarrollo:** Visual Studio Code 🖥️
- **Control de Versiones:** Git y GitHub 🛡️
- **Metodología:** Desarrollo en pares utilizando metodologías ágiles ⚡
- **Herramientas de Organización:** Jira 📌

## 🎯 Requisitos Funcionales

- ✅ **DEBE** mostrar el tablero vacío al inicio.
- ✅ **DEBE** mostrar el estado actual del tablero después de cada movimiento.
- ✅ **DEBE** permitir turnos alternos entre los jugadores (❌ primero, luego ⭕).
- ✅ **DEBE** permitir ingresar el movimiento indicando la fila y la columna.
- ✅ **DEBE** validar que la celda elegida esté vacía antes de permitir un movimiento.
- ✅ **DEBE** verificar después de cada turno si hay un ganador.
- ✅ **DEBE** determinar si el juego termina en empate cuando todas las casillas estén ocupadas.
- ✅ **DEBE** mostrar un mensaje indicando el ganador o si hubo empate.

## ⚙️ Requisitos No Funcionales

- 🖥️ **DEBE** ejecutarse en la terminal sin interfaz gráfica.
- 🚀 **DEBE** optimizar el uso de memoria y seguir las buenas prácticas de programación en Java.
- 📌 **DEBE** mantener una nomenclatura clara y estructurada para clases, atributos y métodos.

## 📦 Instalación

Para ejecutar el proyecto en un entorno **Maven** con **Java 21**, sigue estos pasos:

### 1️⃣ Clonar el repositorio

```sh
 git clone https://github.com/einartech/TicTacToe.git
 cd TicTacToe
```

### 2️⃣ Compilar el proyecto - Preguntar

```sh
 mvn clean install
```

### 3️⃣ Ejecutar la aplicación - Preguntar

```sh
 mvn exec:java -Dexec.mainClass="com.tictactoe.Main"
```

### 4️⃣ Ejecutar el flujo de Test utilizando junit mediante ejecución con bash

```sh
 ./run_tests.sh
```

> ⚠️ **Nota:** Asegúrate de tener **Java 21** y **Maven** correctamente instalados en tu sistema.

## 🎮 ¡Disfruta del desarrollo y mejora continua del _TIC TAC TOE_! 🚀

> **🏆 Copyright © 2025 Einar, Milena . Todos los derechos reservados.**
