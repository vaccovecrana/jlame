package io.vacco.libmp3lame;

/** allows re-use of previously computed noise values */
final class Jcalc_noise_data {
  int global_gain;
  int sfb_count1;
  final int step[] = new int[39];
  final float noise[] = new float[39];
  final float noise_log[] = new float[39];
}
