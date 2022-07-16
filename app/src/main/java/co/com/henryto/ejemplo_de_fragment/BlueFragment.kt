package co.com.henryto.ejemplo_de_fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlueFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlueFragment : Fragment() {// Un fragment, extiende de la clase superior Fragment() y debido a ello
    // es posible sobreescribir todos los metodos asociados al ciclo de vida de un Fragment, por lo que
    // podemos modificar su comportamiento para que haga lo que necesitemos.

    // En https://cursokotlin.com/capitulo-22-fragments-en-kotlin/ Se explica claramente como funciona
    // el ciclo de vida.

    private var listener: OnFragmentActionsListener? = null // creamos la variable listener, que es de

    // tipo OnFragmentActionsListener que es la inteface
    /*
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }
    */
    override fun onAttach(context: Context) { // La función onAttach hace parte del ciclo de vida de un
        //Fragment y se ejecuta automaticamente antes de la funcíón onCreateView. Esto nos ayuda a comprobar
        // de una manera obligada el contenido de la variable listener que creamos anterirmente antes de
        //ejecutar cualquier acción
        super.onAttach(context)
        if (context is OnFragmentActionsListener) {
            listener = context
        }
        //La primera línea llama a la función super(), que no es más que la forma que le decimos al sistema
        // de que, aunque queramos que haga más cosas, ejecute el código que tenga que ejecutarse al llamar
        // a la función onAttach, es decir, que vamos a sobreescribir este emtodo para añadir cosas  pero
        // que no deje de hacer lo que haría ese método normalmente si no lo hubieramos sobreescrito.

        // el if(), comprobará si el contexto que llega a la función onAttach(), tiene implementada la interfaz
        // que hemos creado. En este caso el contexto será de MainActivity, pues es esta clase la que crea el
        // fragment. Para finalizar igualamos el listener que hemos declarado en la parte superior de la clase al contexto.
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blue, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var btnPlus2: Button = ??????????????????????
        btnPlus2.setOnClickListener { listener?.onClickFragmentButton() }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
        //La función onDetach hace parte del ciclo de vida de un Fragment y se ejecuta automaticamente
        // cuando se destruye el fragment y su objetvo es desligar la activity del fragment.
        // Cuando la función onDetach() sea llamada, volveremos a hacer null el listener para asegurarnos
        // de que no haya algún error por falta de comunicación. Ahora si tenemos funcionando nuestro listener.
    }

    /*
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlueFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlueFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
    */
}