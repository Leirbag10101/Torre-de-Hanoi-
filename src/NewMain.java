
import java.util.LinkedList;
import java.util.Stack;
import javax.swing.JOptionPane;

public class NewMain {

	public static void main(String[] args) {

		LinkedList<Stack<Integer>> lista = new LinkedList<Stack<Integer>>();
		Stack<Integer> origem = new Stack<Integer>();
		Stack<Integer> aux = new Stack<Integer>();
		Stack<Integer> destino = new Stack<Integer>();
		boolean flag = false;
		int movOrigem = 0;
		int movDestino = 0;
		int quantDisco = 0;

		quantDisco = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de discos: "));

		if (quantDisco >= 3 || quantDisco <= 8) {

			int z = quantDisco;

			while (z > 0) {

				origem.push(z);
				z--;
			}
		}

		lista.addLast(origem);
		lista.addLast(aux);
		lista.addLast(destino);
		
		do {
			
			movOrigem = Integer.parseInt(JOptionPane.showInputDialog("Origem: "));
			movDestino = Integer.parseInt(JOptionPane.showInputDialog("Destino: "));

			switch (movOrigem) {

				case 1:

					if (movDestino == 2) {

						Stack<Integer> pilhaOrigem = lista.get(0);
						Stack<Integer> pilhaDestino = lista.get(1);
						Integer origemAux = pilhaOrigem.peek();

						if (pilhaDestino.isEmpty()) {
							
							flag = false;
							pilhaDestino.push(pilhaOrigem.pop());
						} else {
							
							flag = false;
							Integer destinoAux = pilhaDestino.peek();
							
							if (origemAux < destinoAux) {

								pilhaDestino.push(pilhaOrigem.pop());
							} else {

								flag = true;
							}
						}
					}

					if (movDestino == 3) {

						Stack<Integer> pilhaOrigem = lista.get(0);
						Stack<Integer> pilhaDestino = lista.get(2);
						Integer origemAux = pilhaOrigem.peek();
						
						if (pilhaDestino.isEmpty()) {
							
							flag = false;
							pilhaDestino.push(pilhaOrigem.pop());
						} else {
							
							flag = false;
							Integer destinoAux = pilhaDestino.peek();

							if (origemAux < destinoAux) {

								pilhaDestino.push(pilhaOrigem.pop());
							} else {

								flag = true;
							}
						}
					}

					break;
				case 2:

					if (movDestino == 1) {

						Stack<Integer> pilhaOrigem = lista.get(1);
						Stack<Integer> pilhaDestino = lista.get(0);
						Integer origemAux = pilhaOrigem.peek();

						if (pilhaDestino.isEmpty()) {
							
							flag = false;
							pilhaDestino.push(pilhaOrigem.pop());
						} else {

							Integer destinoAux = pilhaDestino.peek();

							if (origemAux < destinoAux) {
								
								flag = false;
								pilhaDestino.push(pilhaOrigem.pop());
							} else {

								flag = true;
							}
						}
					}

					if (movDestino == 3) {

						Stack<Integer> pilhaOrigem = lista.get(1);
						Stack<Integer> pilhaDestino = lista.get(2);
						Integer origemAux = pilhaOrigem.peek();
						
						if (pilhaDestino.isEmpty()) {
							
							flag = false;
							pilhaDestino.push(pilhaOrigem.pop());
						} else {

							Integer destinoAux = pilhaDestino.peek();

							if (origemAux < destinoAux) {
								
								flag = false;
								pilhaDestino.push(pilhaOrigem.pop());
							} else {

								flag = true;
							}
						}
					}

					break;

				case 3:
					
					if (movDestino == 1) {

						Stack<Integer> pilhaOrigem = lista.get(2);
						Stack<Integer> pilhaDestino = lista.get(0);
						Integer origemAux = pilhaOrigem.peek();

						if (pilhaDestino.isEmpty()) {
							
							flag = false;
							pilhaDestino.push(pilhaOrigem.pop());
						} else {

							Integer destinoAux = pilhaDestino.peek();

							if (origemAux < destinoAux) {
								
								flag = false;
								pilhaDestino.push(pilhaOrigem.pop());
							} else {

								flag = true;
							}
						}
					}

					if (movDestino == 2) {

						Stack<Integer> pilhaOrigem = lista.get(2);
						Stack<Integer> pilhaDestino = lista.get(1);
						Integer origemAux = pilhaOrigem.peek();

						if (pilhaDestino.isEmpty()) {
							
							flag = false;
							pilhaDestino.push(pilhaOrigem.pop());
						} else {

							Integer destinoAux = pilhaDestino.peek();

							if (origemAux < destinoAux) {
								flag = false;
								pilhaDestino.push(pilhaOrigem.pop());
							} else {

								flag = true;
							}
						}
					}

					break;

			}

			System.out.println("" + lista);
			
			if (flag) {
				
				System.out.println("Movimento invalido!!");
			}
			
			if (destino.size() == quantDisco) {
				
				System.out.println("Teteu gostoso<3!!");
			}
			
		} while (destino.size() != quantDisco);

	}

}
