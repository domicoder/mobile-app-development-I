# Banking Application Flow - ViewModel Implementation

## Descripción

Esta aplicación implementa un flujo de solicitud de tarjeta de crédito utilizando Jetpack Compose con un ViewModel optimizado para manejar el estado de la aplicación y la información del usuario.

## Características Implementadas

### 1. ViewModel Optimizado (`CreditCardViewModel`)

-   **Estado centralizado**: Utiliza `StateFlow` para manejar el estado de la UI de manera reactiva
-   **Validación en tiempo real**: Valida los datos del usuario mientras los introduce
-   **Persistencia de datos**: Mantiene los datos entre navegaciones
-   **Limpieza automática**: Limpia los datos al completar el flujo

### 2. Validación de Datos (`ValidationUtils`)

-   **Validación de email**: Verifica formato de email válido
-   **Validación de nombre**: Asegura que el nombre tenga al menos 2 caracteres y solo letras
-   **Validación de ingresos**: Verifica que sea un número válido mayor a 0
-   **Formateo de moneda**: Formatea los ingresos con 2 decimales

### 3. UI Mejorada

-   **Feedback visual**: Muestra errores de validación en tiempo real
-   **Información en vivo**: Muestra los datos introducidos en cada pantalla
-   **Resumen completo**: Pantalla de confirmación con todos los datos
-   **Estados de botones**: Habilita/deshabilita botones según la validación

## Estructura del Proyecto

```
app/src/main/java/com/domicoder/interactividadjetpackcompose/
├── ui/
│   ├── screens/
│   │   └── AppScreens.kt          # Pantallas de la aplicación
│   └── viewmodel/
│       └── CreditCardViewModel.kt # ViewModel principal
├── util/
│   └── ValidationUtils.kt         # Utilidades de validación
├── AppNavigation.kt               # Navegación de la aplicación
└── MainActivity.kt                # Actividad principal
```

## Flujo de Datos

1. **Pantalla de Bienvenida**: Inicio del flujo
2. **Datos Personales**:
    - Captura nombre y email
    - Validación en tiempo real
    - Muestra información introducida
3. **Datos Financieros**:
    - Captura ingresos mensuales
    - Validación numérica
    - Muestra ingresos formateados
4. **Confirmación**:
    - Resumen de todos los datos
    - Formateo de moneda
5. **Éxito**:
    - Limpieza automática de datos
    - Retorno al inicio

## Tecnologías Utilizadas

-   **Jetpack Compose**: UI declarativa
-   **ViewModel**: Gestión de estado
-   **StateFlow**: Flujos reactivos
-   **Navigation Compose**: Navegación entre pantallas
-   **Material 3**: Diseño moderno

## Beneficios de la Implementación

1. **Separación de responsabilidades**: UI separada de la lógica de negocio
2. **Reutilización**: ViewModel compartido entre pantallas
3. **Mantenibilidad**: Código organizado y documentado
4. **Experiencia de usuario**: Feedback inmediato y validación en tiempo real
5. **Escalabilidad**: Fácil agregar nuevas validaciones o campos

## Uso

Para ejecutar la aplicación:

1. Abrir el proyecto en Android Studio
2. Sincronizar las dependencias de Gradle
3. Ejecutar en un emulador o dispositivo Android

La aplicación mostrará un flujo completo de solicitud de tarjeta de crédito con validación en tiempo real y persistencia de datos.
