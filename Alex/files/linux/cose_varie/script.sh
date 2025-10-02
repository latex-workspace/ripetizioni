
# I=0
# while test $I -lt 10 ; do
#     echo "$I"
#     I=$(( I + 1 ))
# done


# LIST=(1 2 3 4)
#
# for i in "${LIST[@]}"; do
#     echo "$i"
# done

# * matcha 0 o più
# + matcha 1 o più 
# ? matcha 1 o 0 
# \s matcha 0 
# ^ inizio riga
# $ fine riga
# [abc]   a || b || c
# [^abc] !(a || b || c)

for x in ./*.txt; do
  echo $x
done
