package ninja.bryansills.buttz

fun main(args : Array<String>) {
    val component = DaggerAlphaComponent.builder()
        .alphaModule(AlphaModule("BIG"))
        .betaComponent(DaggerBetaComponent.builder()
            .betaModule(BetaModule("FAT"))
            .charlieComponent(DaggerCharlieComponent.builder()
                .charlieModule(CharlieModule("BUTTZ"))
                .build())
            .build())
        .build()

    val alphaData = component.alphaData()

    println(alphaData.toString())
}