Random (a|b)^n c^n String Generator
Description

This repository contains a program to generate strings of the form (a∣b)^nc^n, where n is determined randomly. The string will consist of n characters of 'a' or 'b' in any order, followed by n 'c' characters.

For example, if n=5n=5, possible strings include:

    aabaaccccc
    aabbbccccc
    bbaabccccc

Steps to Generate the String
Step 1: Find n Randomly

Three threads (thread_one, thread_two, and thread_three) are used in conjunction with a shared semaphore to determine the random value of n.

Step 2: Generate the String

Three additional threads (thread_A, thread_B, and thread_C) are used to construct the string:

    Threads A and B share the same semaphore to print 'a' or 'b' n times in random order.
    Thread C appends 'c' characters n times to the end of the string.
