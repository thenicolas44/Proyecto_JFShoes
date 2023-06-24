const startBtn = document.getElementById('btn-voz');
const input = document.getElementById('result');
const recognition = new webkitSpeechRecognition(); // Inicializa el objeto de reconocimiento de voz
recognition.lang = 'es-ES'; // Establece el idioma a español
//recognition.continuous = true; // Permite el reconocimiento continuo
//recognition.interimResults = true; // Proporciona resultados intermedios
startBtn.addEventListener('click', () => {     
    confirm = recognition.start(); // Inicia el reconocimiento de voz cuando se hace clic en el botón
});
recognition.addEventListener('result', (event) => {
    const transcript = event.results[0][0].transcript; // Obtiene el texto reconocido
    var transcriptSinPunto = transcript.replace(/\./g, '');
    input.value = transcriptSinPunto; 
    transcriptSinPunto = transcriptSinPunto.toUpperCase();
    // Muestra el texto reconocido en el elemento 'result'
    if((transcriptSinPunto==="ZAPATILLA ALBA") || (transcriptSinPunto==="Zapatilla Alba") || (transcriptSinPunto==="Alba")){
        window.location.href = "http://localhost:8080/jf-store/detalle/3/";
    }
});

