# Chapter1.java

## JavaFX Overview
- javafix is a GUI framework for Java
- javafx is used to create desktop applications

---

## Learning Objectives
1. Using layout panes, buttons, text fields, and labels
2. Colors, fonts, images, image views and shapes

---

## 1. JavaFX vs Swing vs AWT

### AWT - AbstractWindow Toolkit
- is the oldest GUI framework for Java
- is platform dependent
- is not very flexible

### Swing
- is a part of Java Foundation Classes (JFC)
- is platform independent
- is more flexible than AWT
- is lightweight

### JavaFX
- is the newest GUI framework for Java
- is platform independent
- is more flexible than Swing
- is lightweight
- supports modern UI features such as CSS, animations, and 3D graphics
- enables development of rich internet applications (RIAs)
    - RIAs are web applications that have the features and functionality of desktop applications
- apps run on desktop, mobile, and embedded systems, and web browsers
- provides multitouch support for mobile devices
- has built-in support for audio and video playback

---

## 2. JavaFX Basic Structure

### 1. Application Class
- is the main class that extends `javafx.application.Application`
- is the entry point for JavaFX applications
- has a `public void start(Stage stage)` method that is called when the application is launched

### 2. Stage Class
- is the top-level container for JavaFX applications
- represents a window in a desktop application
- has a title, width, height, and other properties
- can contain one or more scenes
- has a method `show()` to display the window — the stage is given by parameter in the `start()` method
- to run the application, call the `launch()` method from the `main()` method in the Application class

#### Multistage Application
- an application that has multiple windows
- each window is represented by a `Stage` object
- the primary stage is the main window that is created by the JavaFX runtime
- additional stages can be created using the Stage class constructor:  
  `Stage stage2 = new Stage();`

---

## 3. Scene Class
- is the container for all content in a JavaFX application
- represents the content of a window
- has a root node that contains all other nodes in the scene graph
- can contain one or more layout panes and controls
- has a width and height

### Scene Creation Methods
1. `Scene scene = new Scene(Parent root, double width, double height);`
2. `Scene scene = new Scene(Parent root);`

---

## 4. Button Class
- is a control that can be clicked by the user to perform an action
- has a text label that can be set using the constructor or the `setText()` method
- can have an event handler that is called when the button is clicked
- can be added to a layout pane using the `getChildren().add()` method

---

## 5. Layout Panes & UI Controls & Shapes
- are containers that arrange nodes in a specific layout
- examples of layout panes include `FlowPane`, `HBox`, `VBox`, `BorderPane`, `GridPane`, and `StackPane`
- Panes, UI Controls, and Shapes are all subclasses of **Node Class**
    - Node is all the visual elements in JavaFX such as shapes, images, text, buttons, labels, pane, etc.

### Pane
- container that can hold other nodes and arrange them in a specific layout
- is the base class for all layout panes

### Shape
- text, rectangle, line, circle, ellipse, polygon, polyline, arc, polygon

### UI Control
- button, label, text field, check box, radio button, combo box, list view, table view, tree view, etc.

---

## 6. JavaFX Class Hierarchy
- All JavaFX classes are organized in a hierarchical structure
- The `Scene` class is a subclass of the `Parent` class, which is a subclass of the `Node` class
- A Scene can contain a Control or Pane, but NOT a Shape or ImageView
- A Pane can contain any subclass of Node, including Shapes, Controls, and other Panes
- Every subclass of Node has no-argument constructor for creating a default node:  
  `new Button()`, `new Label()`, `new Rectangle()`, `new Circle()`, `new FlowPane()`, etc.

---

## 7. StackPane, Pane, FlowPane, HBox, VBox, BorderPane, GridPane

### a. StackPane
- places all nodes on top of each other in a stack
- puts them all in the center of the pane by default
- respects the node's size; it does not change the size of the components to fit the pane/window — if the pane is smaller than the node, the node will be clipped
- `pane.getChildren` → returns an observable list of nodes that are children of the pane
- `pane.getChildren().add(node)` → adds a node to the pane
- `pane.getChildren().addAll(node1, node2, ...)` → adds multiple nodes to the pane

### b. Pane
- this is the base class; it does not arrange children automatically like the StackPane

---

## 8. JavaFX Coordinates System
- the upper-left corner is (0,0) (pane or scene)
    - NOTE: we set the pane & scene size, not the stage size
- coordinates are in pixels

---

## 9. Color Class

Used to create and manipulate colors.

### **Constructors**
1. ```java
   Color color = Color.rgb(int red, int green, int blue);
   ```
2. ```java
   Color color = Color.rgb(int red, int green, int blue, double opacity);
   ```

> **Note:**
> - `red`, `green`, `blue` → values between **0 and 255**
> - `opacity` → value between **0.0 (transparent)** and **1.0 (opaque)**

You can also use predefined colors such as:
```java
Color color = Color.RED;
```

Or directly apply them:
```java
circle.setFill(Color.RED);
circle.setStroke(Color.BLUE);
```

---

## 10. Font Class

Used to create and style fonts in JavaFX.

### **Constructors**
1. ```java
   Font font = new Font(String family, double size);
   ```
2. ```java
   Font font = Font.font(String family, FontWeight weight, FontPosture posture, double size);
   ```

> **Note:**
> - `family` → font family (e.g. `"Arial"`, `"Verdana"`, `"Times New Roman"`)
> - `weight` → `FontWeight.NORMAL`, `FontWeight.BOLD`, etc.
> - `posture` → `FontPosture.REGULAR`, `FontPosture.ITALIC`, etc.
> - `size` → font size in points (**1 to 100**)

