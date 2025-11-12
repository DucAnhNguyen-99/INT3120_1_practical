@Dao
interface FlightDao {

    @Query("SELECT * FROM airport WHERE iata_code LIKE :query OR name LIKE :query")
    suspend fun searchAirports(query: String): List<Airport>

    @Query("""
        SELECT * FROM airport 
        WHERE iata_code != :departureCode
    """)
    suspend fun getDestinations(departureCode: String): List<Airport>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavorite(favorite: Favorite)

    @Query("SELECT * FROM favorite")
    suspend fun getFavorites(): List<Favorite>
}
