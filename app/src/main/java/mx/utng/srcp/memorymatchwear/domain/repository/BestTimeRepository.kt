package mx.utng.srcp.memorymatchwear.domain.repository

interface BestTimeRepository {
    suspend fun getBestTime(): Long
    suspend fun saveBestTime(seconds: Long)
}
