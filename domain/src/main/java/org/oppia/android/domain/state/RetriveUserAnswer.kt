package org.oppia.android.domain.state

import org.oppia.android.app.model.UserAnswer
import javax.inject.Singleton

@Singleton
object RetriveUserAnswer {
  private var userAnswer: UserAnswer? = null

  fun setUserAnswer(solution: UserAnswer) {
    this.userAnswer = solution
  }
  fun getUserAnswer(): UserAnswer? = userAnswer

  fun clearUserAnswer() {
    userAnswer = null
  }
}