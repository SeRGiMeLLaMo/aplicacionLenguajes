function eliminar(id){
wal({
  title: "¿Estas seguro?",
  text: "Once deleted, you will not be able to recover this imaginary file!",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((OK) => {
  if (OK) {
  $.ajax({
    url:"/eliminar/"+id
    success: function(res){
    console.log(res);
    }
  })
    swal("Poof! Your imaginary file has been deleted!", {
      icon: "success",
        }).then((ok)=>{
            if(ok){
            location.href="/listar";
        }
    });
  } else {
    swal("Your imaginary file is safe!");
  }
});

}
// Función para buscar una persona por su nombre
function buscarPersonaPorNombre(personas, nombre) {
  for (let i = 0; i < personas.length; i++) {
    if (personas[i].nombre === nombre) {
      return personas[i];
    }
  }
  return null; // Si no se encuentra ninguna persona con el nombre dado
}

// Ejemplo de uso
const listaPersonas = [
  { id: 1, nombre: 'Juan', edad: 25 },
  { id: 2, nombre: 'María', edad: 30 },
  { id: 3, nombre: 'Pedro', edad: 35 }
];

const nombreBuscado = 'María';
const personaEncontrada = buscarPersonaPorNombre(listaPersonas, nombreBuscado);

if (personaEncontrada) {
  console.log('Persona encontrada:', personaEncontrada);
} else {
  console.log('No se encontró ninguna persona con el nombre', nombreBuscado);
}

// JavaScript validacion
function validateForm() {
  var name = document.getElementById("name").value;
  var email = document.getElementById("email").value;

  if (name === "") {
    alert("Por favor, ingresa tu nombre");
    return false;
  }

  if (email === "") {
    alert("Por favor, ingresa tu correo electrónico");
    return false;
  }

  return true;
}
// JavaScript alerta
function showAlert() {
  alert("¡Hola! Buenas que bella persona eres (030)");
}
