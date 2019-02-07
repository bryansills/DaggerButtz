package ninja.bryansills.buttz

import dagger.Module
import dagger.Provides

@Module
class AlphaModule(val alphaString: String) {
    @Provides
    fun alphaData(betaData: BetaData): AlphaData = AlphaData(alphaString, betaData.betaString, betaData.charlieString)
}
