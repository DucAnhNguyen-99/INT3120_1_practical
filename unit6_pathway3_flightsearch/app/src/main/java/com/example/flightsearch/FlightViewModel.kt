class FlightViewModel(application: Application) : AndroidViewModel(application) {
    private val dao = FlightDatabase.getDatabase(application).flightDao()
    private val prefs = UserPreferences(application)

    private val _searchResults = MutableStateFlow<List<Airport>>(emptyList())
    val searchResults: StateFlow<List<Airport>> = _searchResults

    fun searchAirports(query: String) {
        viewModelScope.launch {
            prefs.saveLastSearch(query)
            _searchResults.value = dao.searchAirports("%$query%")
        }
    }
}
