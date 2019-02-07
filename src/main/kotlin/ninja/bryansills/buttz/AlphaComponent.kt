package ninja.bryansills.buttz

import dagger.Component

@Component(
    dependencies = [BetaComponent::class],
    modules = [AlphaModule::class]
)
interface AlphaComponent {
    fun alphaData(): AlphaData

    @Component.Builder
    interface Builder {
        fun build(): AlphaComponent
        fun betaComponent(betaComponent: BetaComponent): Builder
        fun alphaModule(alphaModule: AlphaModule): Builder
    }
}