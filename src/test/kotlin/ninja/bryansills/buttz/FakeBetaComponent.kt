package ninja.bryansills.buttz

import dagger.Component

@Component(
    modules = [FakeBetaModule::class]
)
interface FakeBetaComponent {
    fun betaData(): BetaData

    @Component.Builder
    interface Builder {
        fun build(): FakeBetaComponent
        fun fakeBetaModule(fakeBetaModule: FakeBetaModule): Builder
    }
}
