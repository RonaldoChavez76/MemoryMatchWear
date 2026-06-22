package mx.utng.srcp.memorymatchwear.data.repository

import mx.utng.srcp.memorymatchwear.data.datasource.BestTimeDataSource
import mx.utng.srcp.memorymatchwear.domain.repository.BestTimeRepository

class BestTimeRepositoryImpl(private val ds: BestTimeDataSource) : BestTimeRepository {
    override suspend fun getBestTime() = ds.getBestTime()
    override suspend fun saveBestTime(s: Long) = ds.saveBestTime(s)
}
