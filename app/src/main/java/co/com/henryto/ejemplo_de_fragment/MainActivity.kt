package co.com.henryto.ejemplo_de_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

//Bibliografia: https://cursokotlin.com/capitulo-22-fragments-en-kotlin/

//Vamos a crear un nuevo proyecto llamado FragmentExample. La idea de esta
// app será muy sencilla. En nuestra activity principal incluiremos dos
// fragments que ocuparán la mitad de la pantalla respectivamente. Cada una
// tendrá un botón que contactará con la activity para mostrar un mensaje.
//Añadiremos fragments desde el xml, lo que nos permite añadirlos de una
// forma fácil y rápida.

class MainActivity : AppCompatActivity(), OnFragmentActionsListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClickFragmentButton() {
        Toast.makeText(this, "El botón ha sido pulsado", Toast.LENGTH_SHORT).show()
    }
}