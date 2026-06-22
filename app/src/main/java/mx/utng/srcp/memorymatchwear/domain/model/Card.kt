package mx.utng.srcp.memorymatchwear.domain.model

/** entidad inmutable de una tarjeta. */
data class Card(
    val id: Int,             // 0-11 (12 cartas = 6 pares)
    val symbol: CardSymbol,  // qué par es esta tarjeta
    val isFlipped: Boolean = false, // boca arriba?
    val isMatched: Boolean = false  // ya se encontró el par?
)
