# Interfaces
### ActionListener
La interfaz de escucha para recibir eventos de acción. Detecta una accion que activa su metodo **(ActionPerformed)**  
*Se llama justo después de que el usuario realiza una acción*
### AdjustmentListener
 La interfaz de escucha para recibir eventos de ajuste. Es un evento que genera una accion que cambia las propiedades mediante el metodo **(AdjustmentValueChanged)**
 
 ### ComponentListener
 La interfaz de escucha para recibir eventos de componentes. Recibe eventos de algunos componentes o bien algunos controles y cuenta con varios metodos:  
 * **ComponentHidden** *Se llama después de que el componente escuchado se oculta como resultado de la setVisible llamada al método*
 * **ComponentMoved** *Se llama después de que el componente escuchado se mueva, en relación con su contenedor*
 * **ComponentResized** *Se llama después de que cambia el tamaño del componente escuchado*
 * **ComponentShown** *Se llama después de que el componente escuchado se vuelve visible como resultado de la setVisible llamada al método*
 
 ### ContainerListener
 La interfaz de escucha para recibir eventos de contenedores. Sus metodos son:  
 * **ComponentAdded** *Se llama justo después de que se agrega un componente al contenedor escuchado*
 * **ComponentRemoved** *Se llama justo después de eliminar un componente del contenedor escuchado*

### FocusListener
La interfaz de escucha para recibir eventos de teclado se centran en un componente. Sus metodos son:
* **FocusGained** *Se llama justo después de que el componente escuchado obtiene el foco*
* **FocusLost** *Se llama justo después de que el componente escuchado pierde el foco*

### ItemListener
La interfaz de escucha para recibir eventos de elemento. Su metodo es:
* **ItemStateChanged ** *Llamado justo después de un cambio de estado en el componente escuchado*

### KeyListener
La interfaz de escucha para recibir eventos de teclado (combinaciones de teclas). Sus metodos son:
* **KeyPressed** *Se llama justo después de que el usuario presiona una tecla mientras el componente escuchado tiene el foco*
* **KeyReleased ** *Se llama justo después de que el usuario suelta una tecla mientras el componente escuchado tiene el foco**
* **KeyTyped** *Se llama justo después de que el usuario escribe un carácter Unicode en el componente escuchado*

### MouseListener
La interfaz de receptor para la recepción de "interesantes" eventos del ratón en un componente. Sus metodos son:
* **MouseEntered ** *Se llama justo después de que el cursor entra en los límites del componente escuchado*
* **MouseExited** *Se llama justo después de que el cursor sale de los límites del componente escuchado*
* **MousePressed** *Se llama justo después de que el usuario presiona un botón del mouse mientras el cursor está sobre el componente escuchado*
* **MouseReleased** *Se llama justo después de que el usuario suelta un botón del mouse después de presionar el mouse sobre el componente escuchado*

### MouseMotionListener
La interfaz de escucha para recibir eventos de ratón en movimiento en un componente. Sus metodos son:
* **MouseDragged** *Se llama en respuesta a que el usuario mueve el mouse mientras mantiene presionado un botón del mouse*
* **MouseMoved** *Se llama en respuesta a que el usuario mueve el mouse sin presionar ningún botón. Este evento lo activa el componente que se encuentra actualmente bajo el cursor*

### WindowListener
La interfaz de escucha para recibir eventos de ventana. Sus metodos son:
* **WindowActivated** *Se llama justo después de que se active la ventana escuchada*
* **WindowClosed** *Llamado justo después de que se haya cerrado la ventana de escucha*
* **WindowClosing** *Se llama en respuesta a la solicitud de un usuario de que se cierre la ventana de escucha*
* **WindowDeactivated** *Se llama justo después de que se desactive la ventana escuchada, respectivamente*
* **WindowDeiconified** *Se llama justo después de que se deiconifica la ventana escuchada*
* **WindowIconified** * Se llama justo después de que se iconifica la ventana escuchada*
* **WindowOpened** *Se llama justo después de que se haya mostrado la ventana de escucha por primera vez*
