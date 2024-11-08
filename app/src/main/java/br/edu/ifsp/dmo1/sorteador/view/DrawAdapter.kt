package br.edu.ifsp.dmo1.sorteador.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import br.edu.ifsp.dmo1.sorteador.R

class DrawAdapter(
    context: Context,
    datasource: List<Int>
) : ArrayAdapter<Int>(context, R.layout.item_draw, datasource) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        if (itemView == null) {
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            itemView = inflater.inflate(R.layout.item_draw, null)
        }

        val number = getItem(position)
        if (itemView != null && number != null) {
            itemView.findViewById<TextView>(R.id.drawnumber_textview).text =
                String.format("%,d ° sorteio", position+1)
            itemView.findViewById<TextView>(R.id.drawvalue_textview).text =
                String.format("%,d", number)
        }
        return itemView!!
    }
}