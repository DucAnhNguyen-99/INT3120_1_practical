private const val DATASTORE_NAME = "user_prefs"

val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = DATASTORE_NAME)

class UserPreferences(private val context: Context) {

    private val LAST_SEARCH_KEY = stringPreferencesKey("last_search")

    val lastSearchFlow: Flow<String?> = context.dataStore.data
        .map { it[LAST_SEARCH_KEY] }

    suspend fun saveLastSearch(query: String) {
        context.dataStore.edit { prefs ->
            prefs[LAST_SEARCH_KEY] = query
        }
    }
}
