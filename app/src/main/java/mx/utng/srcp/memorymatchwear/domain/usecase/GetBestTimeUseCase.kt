package mx.utng.srcp.memorymatchwear.domain.usecase

import mx.utng.srcp.memorymatchwear.domain.repository.BestTimeRepository

class GetBestTimeUseCase(private val repository: BestTimeRepository) {
    suspend operator fun invoke(): Long = repository.getBestTime()
}
