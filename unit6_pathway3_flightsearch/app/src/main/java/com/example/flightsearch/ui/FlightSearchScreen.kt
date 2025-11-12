@Composable
fun FlightSearchScreen(viewModel: FlightViewModel) {
    val airports by viewModel.searchResults.collectAsState()

    var query by remember { mutableStateOf("") }

    Column(Modifier.padding(16.dp)) {
        OutlinedTextField(
            value = query,
            onValueChange = {
                query = it
                if (query.isNotBlank()) viewModel.searchAirports(query)
            },
            label = { Text("Enter departure airport") },
            modifier = Modifier.fillMaxWidth()
        )

        LazyColumn {
            items(airports) { airport ->
                Text("${airport.iataCode} - ${airport.name}")
            }
        }
    }
}
