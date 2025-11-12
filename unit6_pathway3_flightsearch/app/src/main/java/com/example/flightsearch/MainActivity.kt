class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlightSearchTheme {
                val viewModel: FlightViewModel = viewModel()
                FlightSearchScreen(viewModel)
            }
        }
    }
}
