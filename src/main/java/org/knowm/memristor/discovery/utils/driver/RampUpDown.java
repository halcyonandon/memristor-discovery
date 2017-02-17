package org.knowm.memristor.discovery.utils.driver;

/**
 * Created by timmolter on 2/17/17.
 */
public class RampUpDown extends Driver {

  /**
   * Constructor
   *
   * @param name
   * @param dcOffset
   * @param phase
   * @param amplitude
   * @param frequency
   */
  public RampUpDown(String name, double dcOffset, double phase, double amplitude, double frequency) {

    super(name, dcOffset, phase, amplitude, frequency);
  }

  @Override
  public double getSignal(double time) {

    double T = 1 / frequency;
    double remainderTime = (time + phase) % T;

    // up phase
    if (0 <= (remainderTime) && (remainderTime) * T < .50 / frequency * T) {
      return 2 * frequency * amplitude * (remainderTime) + dcOffset;
    }

    // up phase
    else {
      return 2 * frequency * amplitude * (remainderTime) - 2 * amplitude + dcOffset;
    }
  }
}