package view;

import model.Number;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class NumberViewer {
    public void showNumbers(Set<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        StringBuilder lottoNumbers = new StringBuilder();
        while (iterator.hasNext()) {
            lottoNumbers.append(iterator.next()).append(" ");
        }
        System.out.println("[ LottoNumber ] " + lottoNumbers);
    }

    public void showAnswer(List<Number> numbers) {

        StringBuilder lottoNumbers = new StringBuilder();

        for (int i = 0; i < numbers.size(); i++) {
            lottoNumbers.append(numbers.get(i).getNumber()).append(" ");
        }

        System.out.println("[ AnswerNumber ] " + lottoNumbers+"\n");
    }
}
