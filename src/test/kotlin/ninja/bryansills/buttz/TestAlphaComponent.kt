package ninja.bryansills.buttz

import dagger.Component

@Component(
    dependencies = [FakeBetaComponent::class],
    modules = [AlphaModule::class]
)
interface TestAlphaComponent : AlphaComponent {
    @Component.Builder
    interface Builder {
        fun build(): TestAlphaComponent
        fun fakeBetaComponent(fakeBetaComponent: FakeBetaComponent): Builder
        fun alphaModule(alphaModule: AlphaModule): Builder
    }
}