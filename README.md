# My Android Application (MVC Sample)

This is a sample Android application demonstrating fundamental UI components, layout structures, and user interactions within a Model-View-Controller (MVC) architecture.

## Features

- **UI Components**: The app utilizes several common Android UI elements:
    - `TextView`
    - `EditText`
    - `ImageView`
    - `Button`
- **Layouts**: It showcases how to combine `RelativeLayout` and `LinearLayout` to build a responsive screen where elements are positioned both relative to the parent and in a sequence.
- **User Interactions**:
    - `button#setOnClickListener`: The submit button uses a click listener to show a `Toast` message and dynamically change the image in the `ImageView`.
    - `editText#onFocusChangeListener`: The `EditText` hint text is dynamically cleared on focus to improve user experience.
    - `imageview1.setImageResource`: The image displayed in the `ImageView` is updated based on user actions.
- **Keyboard Handling**: The submit button remains visible and "sticks" above the soft keyboard. This is achieved using `ViewCompat.setOnApplyWindowInsetsListener` to react to keyboard visibility and adjust the layout padding accordingly.

## Architecture

The project follows the **Model-View-Controller (MVC)** pattern:

- **Model**: Data is implicitly handled (e.g., user input from `EditText`, drawable resources).
- **View**: The UI layout is defined in `activity_main.xml`.
- **Controller**: `MainActivity.kt` acts as the controller, handling user input, updating the view, and managing the application logic.

## Screenshot

*(Please replace the placeholder below with a real screenshot of the application running on a device.)*
![STATE 1.png](STATE%201.png)
![STATE 2.png](STATE%202.png)
![STATE 3.png](STATE%203.png)
---

### Initial Commit Summary

- Initial commit for sample (MVC)
- App that uses Relative and Linear Layout.
- Has TextView, EditText, ImageView and Button.
- Uses button#setOnClickListener, editText#onFocusChangeListener, Handles sticky behavior for button using WindowInsetsListener, imageview1.setImageResource
