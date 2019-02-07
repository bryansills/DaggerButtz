package ninja.bryansills.buttz

import dagger.Component

@Component(
    dependencies = [CharlieComponent::class],
    modules = [BetaModule::class]
)
interface BetaComponent {
    fun betaData(): BetaData

    @Component.Builder
    interface Builder {
        fun build(): BetaComponent
        fun charlieComponent(charlieComponent: CharlieComponent): Builder
        fun betaModule(betaModule: BetaModule): Builder
    }
}
