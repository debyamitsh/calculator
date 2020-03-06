package com.debyam.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder
import org.w3c.dom.Text
import kotlin.math.exp

class MainActivity : AppCompatActivity() {
    //Buttons


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val one: TextView = findViewById(R.id.one_button)
        val two: TextView = findViewById(R.id.two_button)
        val three: TextView = findViewById(R.id.three_button)
        val four: TextView = findViewById(R.id.four_button)
        val five: TextView = findViewById(R.id.five_button)
        val six: TextView = findViewById(R.id.six_button)
        val seven: TextView = findViewById(R.id.seven_button)
        val eight: TextView = findViewById(R.id.eight_button)
        val nine: TextView = findViewById(R.id.nine_button)
        val zero: TextView = findViewById(R.id.zero_button)
        val plus: TextView = findViewById(R.id.add_button)
        val multiply: TextView = findViewById(R.id.multiply_button)
        val soustraction: TextView = findViewById(R.id.sous_button)
        val div: TextView = findViewById(R.id.div_button)
        val modulo: TextView = findViewById(R.id.modulo_button)
        val expression: TextView = findViewById(R.id.start_expression)
        val resultExpression: TextView = findViewById(R.id.end_resultat)
        val point: TextView = findViewById(R.id.point_button)
        val equal: TextView = findViewById(R.id.equal_button)
        val delete: TextView = findViewById(R.id.del_button)



        //Action Button
        one.setOnClickListener {
            resultExpression.text = ""
            expression.append("1")
        }
        two.setOnClickListener {
            resultExpression.text = ""
            expression.append("2")
        }
        three.setOnClickListener {
            resultExpression.text = ""
            expression.append("3")
        }
        four.setOnClickListener {
            resultExpression.text = ""
            expression.append("4")
        }
        five.setOnClickListener {
            resultExpression.text = ""
            expression.append("5")
        }
        six.setOnClickListener {
            resultExpression.text = ""
            expression.append("6")
        }
        seven.setOnClickListener {
            resultExpression.text = ""
            expression.append("7")
        }
        eight.setOnClickListener {
            resultExpression.text = ""
            expression.append("8")
        }
        nine.setOnClickListener {
            resultExpression.text = ""
            expression.append("9")
        }
        zero.setOnClickListener {
            resultExpression.text = ""
            expression.append("0")
        }
        plus.setOnClickListener {
            resultExpression.text = ""
            expression.append("+")
        }
        multiply.setOnClickListener {
            resultExpression.text = ""
            expression.append("*")
        }
        soustraction.setOnClickListener {
            resultExpression.text = ""
            expression.append("-")
        }
        div.setOnClickListener {
            resultExpression.text = ""
            expression.append("/")
        }
        point.setOnClickListener {
            resultExpression.text = ""
            expression.append(".")
        }
        delete.setOnClickListener {
            val world = expression.text.toString()
            if(world.isNotEmpty()) {
                expression.text = world.drop(1)
            }

            resultExpression.text = ""
        }
        equal.setOnClickListener {
            val text = expression.text.toString()
            val _expression = ExpressionBuilder(text).build()

            val result = _expression.evaluate()
            val longResult = result.toLong()
            if (result == longResult.toDouble()) {
                resultExpression.text = longResult.toString()
            } else {
                resultExpression.text = result.toString()
            }
        }
        modulo.setOnClickListener {
            resultExpression.text = ""
            expression.append("%")
        }

    }

}
