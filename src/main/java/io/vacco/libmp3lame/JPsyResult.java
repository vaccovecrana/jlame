package io.vacco.libmp3lame;

final class JPsyResult {
  /** loudness calculation (for adaptive threshold of hearing) */
  final float loudness_sq[][] = new float[2][2]; /* loudness^2 approx. per granule and channel */
}
