package org.knowm.memristor.discovery.gui.mvc.experiments.synapse;

/**
 * Created by timmolter on 5/25/17.
 */
public class AHaHController {

  // Order ==> W2, W1, 2+, 1+
  // 00 None
  // 10 Y
  // 01 A
  // 11 B

  public enum Instruction {

    // TODO complete the entire instruction set
    // FFLV(0b1101_0010_0000_0000, 0, 0),
    FF(0b1101_0010_0000_0000, 0, 2),
    RH(0b1011_0000_0000_0000, 0, 1),
    RL(0b1001_0000_0000_0000, 0, -1);
    // RH,
    // RU,
    // RL,
    // RZ;

    private final int bits;
    private final float w2VoltageMultiplier;
    private final float w1VoltageMultiplier;

    Instruction(int bits, float w2VoltageMultiplier, float w1VoltageMultiplier) {

      this.bits = bits;
      this.w2VoltageMultiplier = w2VoltageMultiplier;
      this.w1VoltageMultiplier = w1VoltageMultiplier;
    }

    public int getBits() {

      return bits;
    }

    public float getW2VoltageMultiplier() {

      return w2VoltageMultiplier;
    }

    public float getW1VoltageMultiplier() {

      return w1VoltageMultiplier;
    }
  }
}
