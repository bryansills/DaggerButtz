package ninja.bryansills.buttz

import dagger.Component

@Component(modules = [CharlieModule::class])
interface CharlieComponent {
    fun charlieData(): CharlieData

    @Component.Builder
    interface Builder {
        fun build(): CharlieComponent
        fun charlieModule(charlieModule: CharlieModule): Builder
    }
}
