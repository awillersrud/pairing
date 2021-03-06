package cortex.moves

import cortex.{GameState, Score}

abstract class Move() {
  def nextMoves(gameState: GameState) : List[Move]
  def score(gameState: GameState, minMoves: List[Move]) : Score = { throw new UnsupportedOperationException() }

  def makeMove(gameState: GameState)
  def undoMove(gameState: GameState)

  def choice : String

  def choiceDescription : String

  override def toString = choiceDescription + " " + choice

  def maximizing : Boolean

  def equals(other: Any): Boolean

  override def hashCode = toString.hashCode

}
