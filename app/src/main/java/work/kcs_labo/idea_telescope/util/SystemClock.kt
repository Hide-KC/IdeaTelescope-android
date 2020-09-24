package work.kcs_labo.idea_telescope.util

import java.util.*

interface SystemClock {
  fun getTimeMillis(): Long
  fun getLocale(): Locale
  fun getTimeZone(): TimeZone
}