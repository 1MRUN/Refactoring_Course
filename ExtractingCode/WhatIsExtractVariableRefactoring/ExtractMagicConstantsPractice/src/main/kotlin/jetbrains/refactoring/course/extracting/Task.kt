package jetbrains.refactoring.course.extracting

private const val speedLight = 299792458.0

private const val planc = 6.62607015e-34

fun calculatePhotonEnergy(waveLength: Double): Double {
    val frequency = speedLight / waveLength
    return planc * frequency
}

fun calculatePhotonMass(energy: Double): Double {
    return energy / (speedLight * speedLight)
}

fun main() {
    val waveLength = 0.5e-6
    val photonEnergy = calculatePhotonEnergy(waveLength)
    val photonMass = calculatePhotonMass(photonEnergy)

    println("Photon energy: $photonEnergy Joules")
    println("Photon mass: $photonMass kg")
}
