class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botao.setOnClickListener(){
            val peso = findViewById(R.id.valorPeso) as TextView
            val altura = findViewById(R.id.valorAltura) as TextView
            var result = findViewById(R.id.resultado) as TextView
            var descricao = findViewById(R.id.descricao) as TextView

            val pesoFim = peso.getText().toString()
            val alturaFim = altura.getText().toString()
            val imc = pesoFim.toDouble() / (alturaFim.toDouble() * alturaFim.toDouble())

            resultado.setText(imc.toString())
            if (imc<18.5){
                descricao.setText("Baixo")
            }
            else if(imc<25){
                descricao.setText("Bom")
            }
            else if(imc<30){
                descricao.setText("Alto")
            }
            else{
                descricao.setText("Obesidade")
            }
        }
    }

}
