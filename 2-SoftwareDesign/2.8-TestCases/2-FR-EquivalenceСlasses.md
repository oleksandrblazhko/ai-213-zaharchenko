| Опис вхідних умов                                                         | Правильний/неправильний клас еквівалентності | Опис значень вхідних даних                                  |
| ------------------------------------------------------------------------- | -------------------------------------------- | --------------------------------------------------------- |
| Довжина тексту питання відповідає обмеженням (0 < Довжина < 500 символів) | Правильний                                | Питання = "Як ви почуваєтеся сьогодні?"                  |
| Довжина тексту питання перевищує максимальне обмеження (Довжина > 500 символів) | Неправильний                              | Питання = "Дуже довгий текст, який перевищує 500 символів" |
| Довжина тексту питання менше мінімального обмеження (Довжина < 1 символ)  | Неправильний                              | Питання = ""                                               |
| Довжина тексту питання на межі максимального обмеження (Довжина = 500 символів) | Правильний                                | Питання = "Текст точно на межі 500 символів"               |
| Вхідна дата відповідає обмеженням (Дата відправки - дата поточного дня) | Правильний                                | Дата відправки = сьогоднішня дата                        |
| Вхідна дата більше поточного дня                                        | Неправильний                              | Дата відправки = завтрашня дата                           |
| Вхідна дата менше поточного дня                                        | Неправильний                              | Дата відправки = минула дата                             |
| Вхідна дата невалідна (наприклад, не являється датою)                   | Неправильний                              | Дата відправки = "не дата"                                |

