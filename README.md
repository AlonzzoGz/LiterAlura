
<body>
   <h1>LiterAlura 📚</h1>

   <h2>Descripción 📝</h2>

   <p>
        LiterAlura es un Gestor de Libros desarrollado en Java como parte del Challenge de gestión de libros de Alura Latam en colaboración con Oracle para el programa ONE, especialización Back-End. Este proyecto permite buscar libros por título, autores por nombre, listar libros y autores registrados, obtener estadísticas generales y más. La aplicación interactúa con una API externa para obtener información y utiliza una base de datos local para almacenar y gestionar los datos de libros y autores.
    </p>

   <h2>Tecnologías Utilizadas 💻</h2>

   <ul>
        <li><strong>Lenguaje de Programación:</strong> Java</li>
        <li><strong>API de Libros:</strong> gutendex.com para obtener información sobre libros y autores.</li>
        <li><strong>Framework:</strong> Spring Framework para gestión de dependencias y acceso a la base de datos.</li>
        <li><strong>Base de Datos:</strong> Utiliza una base de datos (H2, MySQL, etc.) para almacenamiento.</li>
        <li><strong>Control de Versiones:</strong> Git/GitHub para el control de versiones y colaboración.</li>
        <li><strong>IDE:</strong> IntelliJ IDEA para desarrollo y ejecución del código Java.</li>
    </ul>

   <h2>Funcionalidades 🧩</h2>

   <h3>Principal.java</h3>

   <p>
        Punto de entrada principal del programa. Gestiona la interacción con el usuario a través de la consola mostrando un menú de opciones y realizando consultas sobre libros y autores.
    </p>

   <p>
        <strong>Funcionalidades principales:</strong>
    </p>

   <ul>
        <li>Búsqueda de libro por título.</li>
        <li>Búsqueda de autor por nombre.</li>
        <li>Listado de libros registrados.</li>
        <li>Listado de autores registrados.</li>
        <li>Listado de autores vivos en un año específico.</li>
        <li>Listado de libros por idioma.</li>
        <li>Obtención de estadísticas generales.</li>
        <li>Listado de los 10 libros más descargados.</li>
        <li>Listado de autores nacidos o fallecidos en un año específico.</li>
    </ul>

   <h3>ConsumoApi.java</h3>

   <p>
        Clase encargada de realizar consultas a la API externa para obtener información sobre libros y autores.
    </p>

   <h3>ConvierteDatos.java</h3>

   <p>
        Convierte los datos obtenidos de la API para su uso en la aplicación.
    </p>

   <h3>AutorRepository.java</h3>

   <p>
        Interfaz que maneja las operaciones de la base de datos relacionadas con los autores.
    </p>

   <h2>Clases Modelo y Mapeo de Entidades 🗃️</h2>

   <p>
        En el proyecto se utilizan clases modelo para representar las entidades del dominio como autores y libros, mapeadas a tablas de base de datos utilizando JPA (Java Persistence API).
    </p>

   <h3>Autor.java</h3>

   <p>
        Clase que representa la entidad "Autor" en la base de datos. Incluye atributos como nombre, fecha de nacimiento, fecha de fallecimiento (puede ser nulo) y lista de libros asociados.
    </p>

   <h3>Datos.java</h3>

   <p>
        Clase para mapear la estructura JSON de la respuesta de la API. Contiene el total de resultados y una lista de libros obtenidos.
    </p>

   <h3>DatosLibro.java</h3>

   <p>
        Representa la información de un libro obtenida de la API. Incluye atributos como título, lista de autores, idiomas disponibles y número de descargas.
    </p>

   <h2>Mapeo de Entidades</h2>

   <p>
        Se utilizan anotaciones JPA como <code>@Entity</code>, <code>@Table</code>, <code>@Id</code>, <code>@GeneratedValue</code>, <code>@Column</code> y <code>@OneToMany</code> para mapear las clases modelo a tablas de base de datos.
    </p>

   <h2>👨‍💻 Desarrollado por</h2>

   <p>Rodrigo Alonso Guzmán Lovo</p>

   <h2>Instrucciones de Uso 🚀</h2>

   <ol>
        <li>Clona este repositorio en tu máquina local.</li>
        <li>Abre el proyecto en IntelliJ IDEA u otro IDE de tu elección.</li>
        <li>Configura la conexión a la base de datos en el archivo de propiedades correspondiente.</li>
        <li>Ejecuta la clase Principal.java para iniciar el programa.</li>
        <li>Sigue las instrucciones en pantalla para gestionar tu biblioteca de libros.</li>
    </ol>

   <p>¡Disfruta gestionando tu biblioteca con LiterAlura!</p>
</body>
