# Violin1
Violinists must put their fingers down strategically when they play. Each note may require a
different finger to be down. We typically refer to the fingers by numbers 1, 2, 3 and 4. Any
subset of these four fingers may be down at any given moment of time, but the one that gets
played is the maximum of the fingers that are down. For example, if the violinist had the fingers
1, 2 and 4 down, then the note played at that time would correspond to the 4. (A violinist can
also be playing on any one of four strings and sometimes play a combination of those strings, but
for this problem, we'll just deal with a violinist playing on a single string.) If no fingers are
down, then the note played is 0.
A violinist is given a sequence of notes to play, which we can simply designated for the purposes
of this problem as a sequence of numbers, each of which is 0, 1, 2, 3 or 4. Here is an example:
>0, 0, 4, 4, 1, 3, 1, 2, 1, 4, 0, 0, and 0

One way in which the violinst could play this sequence would be to put no fingers down for the
first 2 notes, then place all four fingers down in preparation for the third note, lift up fingers 2, 3
and 4 for the fifth note, put just the third finger down for the sixth note, lift that third finger for
the seventh note, put the second finger down for the eighth note, lift the second finger for the
ninth note, put the fourth finger down, followed by removing both the first and fourth finger for
the last three notes. This particular method of playing the notes results in 4 + 3 + 1 + 1 + 1 + 1 +
1 + 2 = 14 total finger movements. Note: This isn't the minimum possible, however.

## The Problem
Given a sequence of notes (0, 1, 2, 3 or 4) that a violinist must play, determine the minimum
number of finger movements necessary to play the sequence. Assume the violinist starts with no
fingers down and can end with any subset of her fingers down.

## The Input
The first line of the input contains a single positive integer, n (n ≤ 30), representing the number
of violin sequences described in the input. The cases follow, one per line. The first value on each
of these lines is a positive integer, k (k ≤ 100000), representing the length of the sequence. This
is followed by k space-separated integers, representing the sequence of notes to be played. Each
of these values will be 0, 1, 2, 3 or 4.
The Output
For each sequence to be played, output the minimum total number of finger movements
necessary to play the sequence on a line by itself.

### Sample Input
>2

>13 0 0 4 4 1 3 1 2 1 4 0 0 0

>3 1 4 1

### Sample Output
>10

>3
