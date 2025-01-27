package org.oppia.android.util.logging.firebase

import com.google.firebase.crashlytics.FirebaseCrashlytics
import dagger.Module
import dagger.Provides
import org.oppia.android.util.logging.EventLogger
import org.oppia.android.util.logging.ExceptionLogger
import org.oppia.android.util.logging.performancemetrics.PerformanceMetricsEventLogger
import javax.inject.Singleton

/** Provides debug log reporting dependencies. */
@Module
class DebugLogReportingModule {
  @Provides
  @Singleton
  fun provideExceptionLogger(): ExceptionLogger =
    FirebaseExceptionLogger(FirebaseCrashlytics.getInstance())

  @Provides
  @Singleton
  fun provideDebugEventLogger(debugEventLogger: DebugEventLogger): EventLogger = debugEventLogger

  @Provides
  @Singleton
  fun providePerformanceMetricsEventLogger(
    factory: FirebaseEventLogger.Factory
  ): PerformanceMetricsEventLogger =
    factory.createPerformanceMetricEventLogger()
}
