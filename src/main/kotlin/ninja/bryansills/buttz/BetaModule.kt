package ninja.bryansills.buttz

import dagger.Module
import dagger.Provides

@Module
class BetaModule(val betaString: String) {
    @Provides
    fun betaData(charlieData: CharlieData): BetaData = BetaData(betaString, charlieData.charlieString)
}
