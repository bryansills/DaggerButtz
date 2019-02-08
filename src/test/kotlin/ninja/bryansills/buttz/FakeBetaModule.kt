package ninja.bryansills.buttz

import dagger.Module
import dagger.Provides

@Module
class FakeBetaModule(val betaString: String, val charlieString: String) {
    @Provides
    fun betaData(): BetaData = BetaData(betaString, charlieString)
}
