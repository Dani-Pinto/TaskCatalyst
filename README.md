# Sistema de Gestión de Tareas

Este proyecto es un sistema de gestión de tareas desarrollado en Java, que implementa los patrones de diseño Singleton y Observer. El sistema permite a los usuarios agregar, gestionar y notificar cambios en tareas, brindando una experiencia eficiente y efectiva para la organización diaria.

## Patrones de Diseño

El proyecto se enfoca en la implementación de dos patrones de diseño clave:

- **Singleton**: Garantiza que solo exista una instancia de la clase `GestorTareas`, permitiendo un acceso global a dicha instancia. Esto se traduce en una gestión centralizada de las tareas.

- **Observer**: Facilita la notificación de cambios en las tareas a través de la implementación del patrón Observer. Varios observadores pueden suscribirse a las tareas y recibir notificaciones cuando se produzcan cambios.

## Características Principales

- Agregar tareas.
- Gestionar tareas existentes.
- Notificar cambios en tareas a observadores registrados.
