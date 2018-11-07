# DADM-practica2

## Descripción general

Ampliar práctica 1 de forma que las preguntas consistan en la reproducción de un fragmento de audio o de vídeo sobre el que es necesario responde una pregunta. Los fragmentos de audio y de vídeo deben estar almacenados localmente en el móvil. El juego debe mantener información persistente para su funcionamento:
* Mejores puntuaciones
* Configuraciones (modo de dificultad, idiomas)
* Conjunto de preguntas (mínimo 20)

## Requisitos mínimos

### Arquitectura básica

Desde la **pantalla principal** se accede a:

* Configuración
* Clasificación
* Juego, con una pantalla de **fin de partida**

### Conjunto de preguntas

Mínimo un conjunto de 20 preguntas, de las cuales como mínimo 10 serán de tipo multimedia (audio o vídeo). Durante una partida se presentan las preguntas al jugador de forma aleatoria y en una cantidad fijada previamente por el usuario. Las preguntas deben almacenarse localmente en el dispositivo empleando técnicas de persistencia.

### Configuración o ajustes

* Fija el número de partidas. 
* Nombre de usuario (posible anonimato)
* Deben ser persistentes

### Información en pantalla durante el juego

* Número de pregunta actual respecto al total
* Número de aciertos y fallos

### Desarrollo del juego

* Quitar la pantalla de: Te has equivocado
* Cuando se responda la última pregunta, se muestra en pantalla el fin de partida con el resultado obtenido. 
* Si la puntuación es de las mejores, pasa automáticamente a la tabla de mejores puntuaciones del juego

### Tabla de puntuaciones

El juego almacena de forma persistente lsa mejores puntuaciones obtenidas. 3Esta tabla puede visualizarse en la sección de clasificación.

## Criterio de evaluación

* Aprobado: implementar requisitos básicos
* Notable: Dos de los tres desafíos plata
* Sobresaliente: Todos los desafíos plata y el desafío oro

### Desafíos plata

#### Diseño
Colores, fondos, imágenes, icono de apliación
#### Varios conjuntos de preguntas
Varios bloques de preguntas o dificultades
#### Cronómetro
Mostrar en todo momento el cronometro. Medir lo que tarda en contestar todas las preguntas

### Desafíos oro

#### Perfiles de usuario
Eliminar la gestión de nombres de usuario de la sección de configuraciíon y añadir una nueva de perfiles. Esta sección debe permitir:
* Elegir un perfil entre los existentes, se mostrará un listado con la siguiente info:
  * Foto
  * Nombre de usuario
  * Máxima de puntuación obtenida
  * Número de partidas realizadas
  * Fecha de la última vez que jugó
* Crear uno nuevo aportando:
  * Nombre de usario
  * Foto, capturando la imagen con la cámara del dispositivo 
* Modificar perfil existente para asignarle nueva foto
* Eliminar un perfil existente: requiriendo confirmación

La información relativa a los usuarios debe ser persistente. El uego debe permitir escoger imagen genérica en el caso de no ser posible obtener una imagen de la cámara

# Importante porque si no Sandra se pone triste
Añadir el uso de ROOM para la Gestión de BBDD o el uso de fragments para modularizar actividades.
