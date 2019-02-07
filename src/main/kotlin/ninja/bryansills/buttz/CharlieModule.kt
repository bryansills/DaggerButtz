package ninja.bryansills.buttz

import dagger.Module
import dagger.Provides

@Module
class CharlieModule(val charlieString: String) {

    @Provides
    fun charlieData(): CharlieData = CharlieData(charlieString)
}
